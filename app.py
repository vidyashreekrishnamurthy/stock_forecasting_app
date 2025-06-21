
# app.py
import streamlit as st
import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt
from prophet import Prophet

st.title("📈 Stock Price Forecasting with Prophet")

ticker = st.text_input("Enter Stock Ticker (e.g., AAPL, INFY)", "AAPL")
period = st.slider("Years of prediction:", 1, 5, 1)

if st.button("Forecast"):
    # Load Data
    data = yf.download(ticker, period="5y")
    df = data[['Close']].reset_index()
    df.columns = ['ds', 'y']

    # Train Prophet
    model = Prophet()
    model.fit(df)

    # Make Future DF
    future = model.make_future_dataframe(periods=period * 365)
    forecast = model.predict(future)

    # Plot
    fig1 = model.plot(forecast)
    st.pyplot(fig1)

    st.subheader("Forecast Components")
    fig2 = model.plot_components(forecast)
    st.pyplot(fig2)
